package org.example;

import java.util.*;
import java.util.ArrayList;

class Node{
    private int Id;    //节点Id
    private int level;   //肯定要记录层次
    private int type;    //要记录是路由节点还是映射节点，映射节点保存公式，保存离群值
    private double alpha;
    private double beta;
    private String data; //节点数据,这里应该保存一个公式
    private Map<Double, Double> outliers_map;
    public List<Node> nodes = new ArrayList<Node>(); //多个子节点，利用List实现
    public Node(int Id){
        this.Id = Id;
    }
    public Node(int Id,String data){
        this.Id = Id;
        this.data = data;
    }
    public Node(int Id,int type,int level){
        this.Id = Id;
        this.type = type;
        this.level=level;
    }
    public Node(int Id,int type,int level,int alpha,int beta){
        this.Id = Id;
        this.type = type;
        this.level=level;
        this.alpha=alpha;
        this.beta=beta;
    }
    public void SetOutliers_map(Map<Double,Double> map)
    {
        outliers_map=map;
    }
    public Map<Double,Double> getOutliers_map()
    {
        return outliers_map;
    }
    public int getType(){return type;}
    public int getLevel(){return level;}











    public void setAlpha(Double a){alpha=a;}
    public void setBeta(Double b){beta=b;}
    public double getAlpha(){return alpha;}
    public double getBeta(){return beta;}
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
}