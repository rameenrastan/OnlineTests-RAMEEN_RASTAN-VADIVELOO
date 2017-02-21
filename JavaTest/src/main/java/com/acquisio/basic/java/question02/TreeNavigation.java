package com.acquisio.basic.java.question02;

/**
 * QUESTION 2: TreeNode
 * Using the tree structure define at
 * http://en.wikipedia.org/wiki/File:Binary_tree.svg,
 * add the code necessary to optain the following output.
 * ..2
 * ....7
 * ......2
 * ......6
 * ........5
 * ........11
 * ....5
 * ......9
 * ........4
 *
 * IMPORTANT: Add all missing javadoc that you think is necessary.
 */
public class TreeNavigation {

    public static void main(String[] args) {
        TreeNavigation main = new TreeNavigation();
        main.treeNode();
    }

    private void treeNode() {
        Node n1 = new Node("6", new Node("5"), new Node("11"));
        Node n2 = new Node("7", new Node("2"), n1);
        Node n3 = new Node("9", new Node("4"));
        Node n4 = new Node("5", null, n3);
        Node n = new Node("2", n2, n4);
        // TODO: Implement code here
        
        System.out.println(".." +n.name);
        System.out.println("...." + n.children[0].name);
        
        //iterates through children of left node
        for(Node leftNodeChild : n.children[0].children){
        	
        	System.out.println("......" + leftNodeChild.name);
        	
        	for(Node child : leftNodeChild.children){
        		
        		System.out.println("........" + child.name);
        		
        	}
        	
        }
        System.out.println("...." + n.children[1].name);
        
        //iterates through children of right node
        for(Node rightNodeChild : n.children[1].children){
        	
        	if(rightNodeChild != null){
        	System.out.println("......" + rightNodeChild.name);
        	
        	for(Node child : rightNodeChild.children){
        		
        		System.out.println("........" + child.name);
        		
        	}}
        	
        }
    }
}
