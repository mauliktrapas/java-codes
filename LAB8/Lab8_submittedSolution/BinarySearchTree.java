
public class BinarySearchTree {
	Employee curr,head;
	
	public void addEmployee(String name,int tenure,int salary,int id){
		Employee toAdd=new Employee(name,tenure,salary,id);
		
		if(head==null){
			head=toAdd;
			head.left=null;
			head.right=null;
			curr=toAdd;
		}
		else{
			for( ; ; ){
				if((curr.tenure>toAdd.tenure) || ((curr.tenure==toAdd.tenure) && curr.salary>toAdd.salary)){
					if(curr.left==null){
						curr.left=toAdd;
						curr.left.left=null;
						curr.left.right=null;
						break;
					}
					else{
						curr=curr.left;
					}
				}
				else{
					if(curr.right==null){
						curr.right=toAdd;
						curr.right.left=null;
						curr.right.right=null;
						break;
					}
					else{
						curr=curr.right;
					}
				}
			}
		}
	}
	
	public void searchEmployee(int tenure,int salary){
		curr=head;
		int flag=-1;
		
		while(curr!=null){
			if((curr.tenure==tenure) && (curr.salary==salary)){
				System.out.print(curr.id+" ");
				flag=1;
				curr=curr.right;
			}
			else if((curr.tenure<=tenure) && (curr.salary<salary)){
				curr=curr.right;
			}
			else{
				curr=curr.left;
			}
		}
		
		if(flag==1){
			System.out.println();
		}
		else{
			System.out.println("NOT FOUND");
		}
	}
}
