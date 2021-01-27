package org.example;

/**
 * Hello world!
 *
 */
public class  App
{
    public static void main( String[] args )
    {
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
