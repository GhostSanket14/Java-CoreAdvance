package BST;

import java.util.*;
import java.util.Scanner;

public class binarySearchTree {
	
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
	
	public static void binarySearch(bTreeNode<Integer> root, int KEY) {
		if(root==null) {
			return;
		}
		if(KEY==root.data) {
			System.out.println("Value "+root.data+" is found");
			return;
		}
		
		if(KEY<root.data) {
			binarySearch(root.left, KEY);
		}
		if(KEY>root.data) {
			binarySearch(root.right, KEY);
		}
		
	}

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		bTreeNode<Integer> root=inputLevelwise();
		System.out.println();
		printLevelWise(root);
		System.out.println(" Enter value u want to search: ");
		int KEY=sc.nextInt();
		System.out.println();
		binarySearch(root, KEY);
	}
}