package JavaBasics.Arrays;

public class LinearSearch {

    public static int linearSearch(int arr[], int searchednumber){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == searchednumber){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int searchednumber = 20;
        int index = linearSearch(arr, searchednumber);
        if(index == -1){
            System.out.print("The searched element is not found in the array");
            
        }
        else{
            System.out.print("The searched element: "+searchednumber+ " is found at postion: " +(index+1));
                
            }
    }
}
