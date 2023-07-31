package binaryTree;

import java.util.*;
import java.util.Scanner;

public class bTreeUse_IPOP_iteratively_withOperations {
	
	public static bTreeNode<Integer> inputLevelwise(){
		Scanner sc=new Scanner(System.in);
		Queue<bTreeNode<Integer>> pendingNodes=new LinkedList<>();
		System.out.println("Enter root : ");
		int rootData=sc.nextInt();
		
		bTreeNode<Integer> root=new bTreeNode<>(rootData);
		pendingNodes.offer(root);
		
		if(rootData==-1) {
			return null; 
		}
		while(!pendingNodes.isEmpty()) {
			bTreeNode<Integer> frontNode=pendingNodes.poll();
			System.out.println("Enter left for node "+frontNode.data);
			int Data=sc.nextInt();
			if(Data!=-1) {
				bTreeNode<Integer> node=new bTreeNode<>(Data);
				pendingNodes.offer(node);
				frontNode.left=node;
			}
			
			System.out.println("Enter right for node "+frontNode.data);
			Data=sc.nextInt();
			if(Data!=-1) {
				bTreeNode<Integer> node=new bTreeNode<>(Data);
				pendingNodes.offer(node);
				frontNode.right=node;
			}
		}
			return root;
	}
		
	public static void printLevelWise(bTreeNode<Integer> root) { // I will do it. Did it Boi :)
		
		if(root==null) { // not a base case, it is here to avoid null pointer exception.
			return;
		}
		Queue<bTreeNode<Integer>> pendingNodes=new LinkedList<>();
		pendingNodes.offer(root);
		
		while(!pendingNodes.isEmpty()) {
			bTreeNode<Integer> frontNode=pendingNodes.poll();
			System.out.print(frontNode.data+": ");
			
			if(frontNode.left!=null) {
				System.out.print("L "+frontNode.left.data+" ");
				pendingNodes.offer(frontNode.left);
			}
			if(frontNode.right!=null) {
				System.out.print("R "+frontNode.right.data);
				pendingNodes.offer(frontNode.right);
			}
			System.out.println();
		}
		
	}
	
	public static int countNodes(bTreeNode<Integer> root) { // Yeah boi, wrote it myself.
		int count=1;
		
		if(root==null) { // Not a base case, using this to avoid NullPointerException. If user gave empty tree.
			return 0;
		}
			count+=countNodes(root.left);
			count+=countNodes(root.right);		// I had used if(root.left!=null) & if(root.left!=null) but this will not count the leaf nodes.	
		return count;					// So as we are going down till last node as root, we can just say root!=null . This will work better.
	}
	
	public static int diameter(bTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		
		int option1=height(root.left)+height(root.right);
		int option2=diameter(root.left);
		int option3=diameter(root.right);
		
		return Math.max(option1, Math.max(option2, option3));		
	}
	
	private static int height(bTreeNode<Integer> root) {
	
		if(root==null) {
			return 0;
		}
		
		int Lh=height(root.left);
		int Rh=height(root.right);
		return 1+Math.max(Lh, Rh);
	}

	public static void main(String[] args) {
		bTreeNode<Integer> root=inputLevelwise();
		printLevelWise(root);
		System.out.println(countNodes(root));
		System.out.println(diameter(root));
	}
}