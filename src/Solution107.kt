import java.util.*
import javax.swing.tree.TreeNode

class Solution107 {
    var levels: MutableList<MutableList<Int>> = mutableListOf()
    fun helper(node: TreeNode, level: Int) {
        // start the current level
        if (levels.size == level) levels.add(ArrayList())

        // append the current node value
        levels[level].add(node.`val`)

        // process child nodes for the next level
        if (node.left != null) helper(node.left!!, level + 1)
        if (node.right != null) helper(node.right!!, level + 1)
    }

    fun levelOrderBottom(root: TreeNode?): List<MutableList<Int>> {
        if (root == null) return levels
        helper(root, 0)
        Collections.reverse(levels)
        return levels
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}