public class Main
{
	public static void main(String[] args) {
		int arr[]= {1,2,2,2,2,3,4,4,4,5,6,7,8,8,8};
		int start=0;
		int end= arr.length-1;
		
		int result1= lastOccurence(arr,2,start,end);
		System.out.println("Last Occurence of element:" +  " " +result1);
		int result2= firstOccurence(arr,2,start,end);
		System.out.println("First Occurence of element:"+ " " + result2);
	}
		public static int lastOccurence(int arr[], int target, int start, int end){
		    int lastIndex=-1;
		    while(start<=end){
		        int mid= start +(end-start)/2;
		    
		        if(arr[mid]==target){
		            lastIndex=mid;
		            start=mid+1;
		        }
		        else if(target>arr[mid]){
		            start= mid +1;
		        }else{
		            end=mid -1;
		        }
		        
		    }
		    return lastIndex;
	}
	    public static int firstOccurence(int arr[],int target, int start, int end){
	        int firstIndex=-1;
	        while(start<=end){
		        int mid= start +(end-start)/2;
		    
		        if(arr[mid]==target){
		            firstIndex=mid;
		            end=mid-1;
		        }
		        else if(target>arr[mid]){
		            start= mid +1;
		        }else{
		            end=mid -1;
		        }
		        
		    }
		    return firstIndex;
	        
	    }
    
}
		
	

