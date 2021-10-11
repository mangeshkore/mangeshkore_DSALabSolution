package service;

import model.Node;
import java.util.ArrayList;


public class PathFinderService {

    public ArrayList<Integer> findLongestPath(Node root) {
        if (root == null) {
            return new ArrayList<>();
        }
        ArrayList<Integer> rightNode = findLongestPath(root.getRight());
        ArrayList<Integer> leftNode = findLongestPath(root.getLeft());

        if (rightNode.size() < leftNode.size()) {
            leftNode.add(root.getData());
        } else {
            rightNode.add(root.getData());
        }

        return leftNode.size() > rightNode.size() ? leftNode : rightNode;

    }
}
