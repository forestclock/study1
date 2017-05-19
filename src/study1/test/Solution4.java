package study1.test;

import java.util.ArrayList;
import java.util.List;

import study1.tree.TreeNode;
/**
 * 
 * @ClassName Solution4
 * @Description 之字形打印二叉树
 * @author zhong
 * @date 2017年4月10日下午8:21:21
 *
 */
public class Solution4 {
	
public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        
		ArrayList<Integer> row = new ArrayList<>();
        ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
        
        if(pRoot == null){
            return results;
        }else{
            
        
        row.add(pRoot.getValue());
        results.add(row);
        
        List<TreeNode> levelNodes = new ArrayList<>();
        levelNodes.add(pRoot);
        //List<TreeNode> resultNodes = getLevels(levelNodes);
        
        int tmp = 0;
        while(levelNodes != null && levelNodes.size() != 0){
            ArrayList<Integer> row2 = new ArrayList<>();
            tmp++;
            levelNodes = getLevels(levelNodes);
            //resultNodes = levelNodes;
            if(tmp%2 == 1){
                for(int i = (levelNodes.size() - 1);i >= 0;i--){
                    row2.add(levelNodes.get(i).getValue());
                }
            }else{
                for(int i =0;i<levelNodes.size();i++){
                    row2.add(levelNodes.get(i).getValue());
                }
            }
            if(row2 != null && row2.size() != 0){
            	results.add(row2);   
            }
        }
        return results;  
        }
    }
    
    
   	public List<TreeNode> getLevels(List<TreeNode> pRoots){

       List<TreeNode> nodes = new ArrayList<TreeNode>();
       for(TreeNode node:pRoots){
           TreeNode left = node.getLeft_node();
           TreeNode right = node.getRight_node();
           if(left != null){
              nodes.add(left); 
           }
           if(right != null)
                nodes.add(right);
        }
     	return nodes;
	}
}
