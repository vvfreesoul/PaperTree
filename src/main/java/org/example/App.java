package org.example;

import javafx.util.Pair;

import java.util.*;

/**
 * Hello world!
 *
 */
public class  App<i>
{
    Node TRSTree(List<Map<Integer, Integer>> avg_host,List<Map<Integer, Integer>> avg_data,int fanout)
    {
        int nodecount=0;
        int level=0;
        Node root=new Node(nodecount,0,level);
        nodecount++;
        level++;
        Pair<List<Map<Integer, Integer>>, List<Map<Integer, Integer>>> avg_pair = new Pair<>(avg_host, avg_data);
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
