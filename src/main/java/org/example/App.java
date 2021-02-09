package org.example;


import jdk.internal.net.http.common.Pair;

import java.util.*;
/**
 * Hello world!
 *
 */
public class  App<i>
{
    List<Node> SplitNode(Node node,int fanout)
    {
        List<Node> listnode=new ArrayList<Node>();
        return listnode;
    }
    void Compute(List<Map<Integer, Integer>> avg_host,List<Map<Integer, Integer>> avg_data,Node node)
    {
        Integer cov_host_data;
        Integer E_avg_host;
        Integer E_avg_data;
        Integer E_host_data;
        for(int i=0;i<avg_host.size();i++)
        {

        }
    }
    boolean Validate(List<Map<Integer, Integer>> avg_host,List<Map<Integer, Integer>> avg_data,Node node)
    {
          Node root=new Node(0,0,0);
          Queue<List<Map<Integer, Integer>>> queue_map_host = new LinkedList<>();
          Queue<List<Map<Integer, Integer>>> queue_map_data=new LinkedList<>();
          Queue<Node> queue_node=new LinkedList<>();
          queue_map_host.add(avg_host);
          queue_map_data.add(avg_data);
          queue_node.add(node);
          while(!queue_node.isEmpty())
          {
              Node poll_node=queue_node.poll();
              List<Map<Integer, Integer>> poll_host=queue_map_host.poll();
              List<Map<Integer, Integer>> poll_data=queue_map_data.poll();
              Compute(poll_host,poll_data,poll_node);
          }
//        for(int i=0;i<avg_host.size();i++)
//        {
//            计算两个点是否线性相关
//
//            线性相关则继续
//            线性不相关则把点存一下最起码存一下，先不考虑存了之后的操作
//        }
//        if(node.ouliers.size()>outlier_ratio*avg_data.size())
//            return false;
        return true;
    }
    void Compute(List<Map<Integer, Integer>> avg_host,List<Map<Integer, Integer>> avg_data,int fanout)
    {

        
    }
    Node TRSTree(List<Map<Integer, Integer>> avg_host,List<Map<Integer, Integer>> avg_data,int fanout)
    {
        int nodecount=0;
        int level=0;
        Node root=new Node(nodecount,0,level);
        nodecount++;
        level++;
        Pair<List<Map<Integer, Integer>>, List<Map<Integer, Integer>>> avg_pair = new Pair<>(avg_host, avg_data);
        Pair<Node,List<Map<Integer, Integer>>> queue_pair=new Pair<>(root,avg_data);
//        Queue<Pair<Node,List<Map<Integer, Integer>>>>=new
//        while()
        return root;
    }
    public static void main( String[] args )
    {
        List<Map<Integer, Integer>> avg_host=new ArrayList<>();
        List<Map<Integer, Integer>> avg_data=new ArrayList<>();

        for(int i=0;i<100000;i++)
        {
            Random random = new Random();
            Map<Integer, Integer> map=new HashMap<Integer, Integer>();
            map.put(i,random.nextInt(128));
            avg_host.add(map);
            Map<Integer, Integer> map_data=new HashMap<Integer, Integer>();
            map_data.put(i,2*random.nextInt(128));
            avg_data.add(map_data);
        }

        Tree tree = new Tree();
        tree.add(0, "一级树杈1");
        tree.add(0, "一级树杈2");
        tree.add(0, "一级树杈3");
        tree.add(1, "二级树杈1");
        tree.add(1, "二级树杈2");
        tree.add(2, "二级树杈3");
        tree.add(6, "三级树杈1");
        tree.add(6, "三级树杈2");
        tree.list();
    }
}
