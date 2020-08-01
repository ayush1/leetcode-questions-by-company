public class DiameterOfBinaryTree{
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;

        Height height = new Height();
        int treeHeight = heightOfTree(root, height);

        return height.h;
    }

    public int heightOfTree(TreeNode node, Height height){
        if(node == null)
            return 0;

        int l_height = heightOfTree(node.left, height);
        int r_height =  heightOfTree(node.right, height);

        height.h = Math.max(height.h, l_height + r_height);

        return Math.max(l_height, r_height) + 1;
    }
}

class Height{
    int h = Integer.MIN_VALUE;
}