package org.example;

import java.util.*;
import java.util.ArrayList;

class Node{
    private int Id;    //节点Id
    private String data; //节点数据
    public List<Node> nodes = new ArrayList<Node>(); //多个子节点，利用List实现
    public Node(int Id){
        this.Id = Id;
    }
    public Node(int Id,String data){
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