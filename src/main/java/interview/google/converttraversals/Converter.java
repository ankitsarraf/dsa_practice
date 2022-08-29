package interview.google.converttraversals;

import interview.google.tree.TreeNode;

public interface Converter {
	
	TreeNode<Integer> convert(Integer[] preorder, Integer[] inorder);

	void print(Integer[] preorder, Integer[] inorder);

}
