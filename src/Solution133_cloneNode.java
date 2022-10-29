import java.util.*;
public class Solution133_cloneNode {
    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
    class Solution {
        Node output = new Node();
        public Node cloneGraph(Node node) {
//            ArrayList<Node> array = (ArrayList<Node>) node.neighbors;
//            Node j = new Node(count,array);
//            answer.add(j);
//            count +=1;
//            if(node==null){
//                return answer;
//            }
//            return cloneGraph(j);
            for(Node i:node.neighbors){
                output.neighbors.add(i);
            }
            return cloneGraph(output);
        }

    }
}
