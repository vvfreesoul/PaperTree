package org.example;


import javafx.util.Pair;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Test {
    //map的窗口的右边界点，窗口的值
    static void BuildTree(Map<Double, Double> avg_host, Map<Double, Double> avg_data)
    {
        Queue<Node> queue_node = new LinkedList<>();
    }
    static int Validate(Map<Double, Double> avg_host, Map<Double, Double> avg_data, Node node)
    {
        Double value_avg_host=0.0;
        Double value_avg_data=0.0;
        Double epsilon=0.5;
        int outliers_count=0;
        Map<Double,Double> outliers_map = null;
        Double size=Double.valueOf(avg_host.size());
        for(Double key : avg_host.keySet()) {
            value_avg_host=avg_host.get(key);
            value_avg_data=avg_data.get(key);
            //如果不在区间范围内
            if(!(value_avg_host>node.getBeta()*value_avg_data+node.getAlpha()-epsilon&&value_avg_host<node.getBeta()*value_avg_data+node.getAlpha()+epsilon))
            {
                //如果是离群点，则outlier_count++，且将其加入离群队列
                outliers_count=outliers_count+1;
                if(outliers_count>=size*0.1)
                    return 0;
                outliers_map.put(key,value_avg_data);
            }
        }
        return 1;
    }
    static void Compute(Map<Double, Double> avg_host, Map<Double, Double> avg_data, Node node) {
        Double cov_host_data=0.0;
        Double EX_avg_host=0.0;
        Double EX_avg_data=0.0;
        Double EX_host_mul_data=0.0;
        Double Variance_data=0.0;
        int flag=0;
        int i=1;
        for(Double key : avg_host.keySet()) {
            if (flag == 0) {
                EX_avg_host = avg_host.get(key);
                EX_avg_data=avg_data.get(key);
                EX_host_mul_data=EX_avg_host*EX_avg_data;
                flag = 1;
                continue;
            }
//            System.out.print(value);
            EX_avg_host += (avg_host.get(key) - EX_avg_host) / (i + 1);

            EX_avg_data += (avg_data.get(key) - EX_avg_data) / (i + 1);

            EX_host_mul_data += (avg_host.get(key)*avg_data.get(key) - EX_host_mul_data) / (i + 1);
            i++;
        }
        flag=0;i=1;
        for(Double value:avg_data.values())
        {
            if (flag == 0) {
                Variance_data=(value-EX_avg_data)*(value-EX_avg_data);
            }
            Variance_data+=((value-EX_avg_data)*(value-EX_avg_data) - Variance_data) / (i + 1);
            i++;
        }
        Double cov=EX_host_mul_data-EX_avg_data*EX_avg_host;
        node.setBeta(cov/Variance_data);
        node.setAlpha(EX_avg_host-node.getBeta()*EX_avg_data);

    }
    public static void main( String[] args )
    {
//        Pair<Double, String> pair = new Pair<>(1, "One");
//        double a=3;
//        double b=22;
//        double dd=(double)3/(double)22;
//        System.out.println(dd);
        Map<Double,Double> datamap=new HashMap<Double, Double>();
        Map<Double,Double> datamap2=new HashMap<Double,Double>();
        double sum=0.0;
        for(int i=0;i<100;i++) {
            datamap.put(i + 0.0, i+ 0.0);
            datamap2.put(i + 0.0, i+ 0.0);
            sum += i;
        }
//        for(Double value : datamap.values();Double value2:datamap2.values())
//        {}
        Node node=new Node(0,0,0);
        System.out.print("sum/100:"+sum/100);
//        System.out.print("Compute:"+Compute(datamap, datamap,node));
//        if(Compute(datamap,datamap,node)==sum/100)
//            System.out.print("true");
//        else
//            System.out.print("false");

    }
}
