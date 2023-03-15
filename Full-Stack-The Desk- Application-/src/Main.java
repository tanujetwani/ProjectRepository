import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {

	
	 public static void main(String[] args) {
	        /*System.out.println("Hello World!");*/
	        System.out.println("\n**************************************\n");
	        System.out.println("\tWelcome to TheDesk \n");
	        System.out.println("**************************************");
	        optionsSelection();

	    }
	    private static void optionsSelection() {
	        String[] arr = {"1. I wish to review my expenditure",
	                "2. I wish to add my expenditure",
	                "3. I wish to delete my expenditure",
	                "4. I wish to sort the expenditures",
	                "5. I wish to search for a particular expenditure",
	                "6. Close the application"
	        };
	        int[] arr1 = {1,2,3,4,5,6};
	        int  slen = arr1.length;
	        for(int i=0; i<slen;i++){
	            System.out.println(arr[i]);
	            // display the all the Strings mentioned in the String array
	        }
	        ArrayList<Integer> arrlist = new ArrayList<Integer>();
	        ArrayList<Integer> expenses = new ArrayList<Integer>();
	        expenses.add(1000);
	        expenses.add(2300);
	        expenses.add(45000);
	        expenses.add(32000);
	        expenses.add(110);
	        expenses.addAll(arrlist);
	        System.out.println("\nEnter your choice:\t");
	        Scanner sc = new Scanner(System.in);
	        int  options =  sc.nextInt();
	        for(int j=1;j<=slen;j++){
	            if(options==j){
	                switch (options){
	                    case 1:
	                        System.out.println("Your saved expenses are listed below: \n");
	                        System.out.println(expenses+"\n");
	                        optionsSelection();
	                        break;
	                    case 2:
	                        System.out.println("Enter the value to add your Expense: \n");
	                        int value = sc.nextInt();
	                        expenses.add(value);
	                        System.out.println("Your value is updated\n");
	                        expenses.addAll(arrlist);
	                        System.out.println(expenses+"\n");
	                        System.out.println(arrlist + "\n");
	                        optionsSelection();

	                        break;
	                    case 3:
	                        System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
	                        int con_choice = sc.nextInt();
	                        if(con_choice==options){
	                               expenses.clear();
	                            System.out.println(expenses+"\n");
	                            System.out.println("All your expenses are erased!\n");
	                        } else {
	                            System.out.println("Oops... try again!");
	                        }
	                        optionsSelection();
	                        break;
	                    case 4:
	                        sortExpenses(expenses);
	                        optionsSelection();
	                        break;
	                    case 5:
	                        searchExpenses(expenses);
	                        optionsSelection();
	                        break;
	                    case 6:
	                        closeApp();
	                        break;
	                    default:
	                        System.out.println("You have made an invalid choice!");
	                        break;
	                }
	            }
	        }

	    }
	    private static void closeApp() {
	        System.out.println("Closing your application... \nThank you!");
	            }
	    private static void searchExpenses(ArrayList<Integer> arrayList) {
	        int leng = arrayList.size();
	        int found;
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Enter the expense you need to search:\t");
	        int search_expense= sc.nextInt();
	        sort(arrayList,leng);
	  
	        found= binarySearch(arrayList,leng, search_expense);
	        
	        if(found==1)
	        {System.out.println("The expense " + search_expense + " has been found.");
	        
	        }else
	        
	        {
	        	System.out.println("The expense " + search_expense + " is not there.");
	        }
	        
	        //Complete the method
	    }
	    private static void sortExpenses(ArrayList<Integer> arrayList) {
	        int arrlength =  arrayList.size();
	        
          sort(arrayList, arrlength);	 
      
	        System.out.println(arrayList);
	       //Complete the method. The expenses should be sorted in ascending order.
	    }
	    

	 public static void sort(ArrayList<Integer>arrayList, int arrlength ){
	        int temp1=0;
	       
	        
	        for(int i=0; i<arrlength; i++) {
	        	 
	        	for (int j=1; j<arrlength; j++) {
	        		
	        		if(arrayList.get(j-1)>arrayList.get(j)){
		   
	        			temp1 = arrayList.get(j-1);
		                //temp2=arrayList.get(j);
		                //arrayList.set(j-1, temp2);
		                arrayList.set(j-1,arrayList.get(j));
		                arrayList.set(j,temp1);

		                } // End of if

                   // System.out.println(j + " Pass: " +arrayList );
		            }//End of inner for

		        }  //End of outer for

	        			
	}    //End of sort
	    

	    
	    
	    public static int binarySearch(ArrayList<Integer>arrayList, int length, int search_expense) {
	    	
	    	int low=0, high=length-1; 
	    	int mid,found=0;
	    	
	    	while(low<=high) {
	    		
	    	mid=(low+high)/2;
	    	
	    	if(arrayList.get(mid)==search_expense) {
	    		
	    		found=1;
	    		return found;
	    	}
	    	
	    	else if(arrayList.get(mid)<search_expense) {
	    		
	    		low=mid+1;
	    	}
	    	else {
	    		
	    		high=mid-1;
	    	}
	    	
	    } //End of while
	    	
	    return found;	
	    
	    }  //End of binarySearch
	    
	       	    
}// End of class "Main"