package org.example;

import java.util.*;
import java.util.ArrayList;

class Node{
    private int Id;    //节点Id
    private int level;   //肯定要记录层次
    private int type;    //要记录是路由节点还是映射节点，映射节点保存公式，保存离群值
    private int alpha;
    private int beta;
    private String data; //节点数据,这里应该保存一个公式
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
    public int getType(){return type;}
    public int getLevel(){return level;}
    public int getAlpha(){return alpha;}
    public int getBeta(){return beta;}
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