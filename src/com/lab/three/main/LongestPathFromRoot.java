package com.lab.three.main;

import com.lab.three.model.Node;
import com.lab.three.service.PathFinderService;

import java.util.ArrayList;
/**
 * Solution for Question 2
 */
public class LongestPathFromRoot {

    public static void main(String[] args) {
        PathFinderService pathFinderService = new PathFinderService();
        //create nodes
        Node node1 = new Node(100);
        Node node2 = new Node(20);
        Node node3 = new Node(130);
        Node node4 = new Node(10);
        Node node5 = new Node(50);
        Node node6 = new Node(110);
        Node node7 = new Node(140);
        Node node8 = new Node(5);

        //build given binary tree
        node4.setLeft(node8);
        node2.setLeft(node4);
        node2.setRight(node5);
        node3.setLeft(node6);
        node3.setRight(node7);
        node1.setLeft(node2);
        node1.setRight(node3);

        //find the longest path
        ArrayList<Integer> result = pathFinderService.findLongestPath(node1);

        //display results
        System.out.println("Longest path:");
        for (int i = result.size() - 1; i >= 0; i--) {
            System.out.println(result.get(i));
        }
    }
}