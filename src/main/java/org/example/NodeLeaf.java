package org.example;

import java.util.*;
import java.util.ArrayList;

class NodeLeaf{
    private int Id;    //节点Id
    private int level;   //肯定要记录层次
    private int type;    //要记录是路由节点还是映射节点，映射节点保存公式，保存离群值
    private String data; //节点数据,这里应该保存一个公式
    public List<Node> nodes = new ArrayList<Node>(); //多个子节点，利用List实现
    public NodeLeaf(int Id){
        this.Id = Id;
    }
    public NodeLeaf(int Id,String data){
        this.Id = Id;
        this.data = data;
    }
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