//To create a program for more efficient binary search than the usual one
class Modified_binary_search
{
int a[];  //declaring array
int low;  //to store the lower position of array search pointer
int high; //to store the upper position of array search pointer
int mid;  //to store the middle position of array search pointer
int x;  //to store the number to be searched
//To initialize the global variables using parameterized constructor
Binary_search(int size, int s)
{
a[]=new int[size];
high=size-1;
x=s;
low=0;
} //end of parameterized constructor
//To make a function for filling the array
void fill_array(int size)throws IOException
{
InputStreamReader re=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(re);
System.out.println("Input the elements of array.");
for(int i=0; i<size; i++)
a[i]=Integer.parseInt(br.readLine());
} //end of fill_array()
//To make a function for searching the inputted number from the array
int search()
{
while(low<high)
{
if(x>a[high] || x<a[low])
  return -1;
  mid=(low+high)/2;
 else if(s==a[low])
    return (low+1);
  else if(s==a[high])
    return (high+1);
  else if(s==a[mid])
    return (mid+1);
  else if(s>a[mid])
    low=mid+1;
  else
  high=mid-1;
} //end of while
  return -1;
} //end of search()
  //To make a function to display the inputted array
void display_array()
{
System.out.println("Inputted array is as follows:");
for(int i=0; i<size; i++)
System.out.print(a[i]+" ");
} //end of display_array()
} //end of class Binary_search
//To make the main method class
class Modified_binary_searchMain
{
  public static void main(String args[])throws IOException
  {
    InputStreamReader re=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(re);
    int size;
    int s;
    System.out.println("Input the size of the array.");
    size=Integer.parseInt(br.readLine());
    System.out.println("Input the number to be searched.");
    s=Integer.parseInt(br.readLine());
    Modified_binary_search ob=new Modified_binary_search(size,s);
    ob.fill_array(size);
    ob.display();
    int pos=ob.search();
    System.out.println("Number to be searched="+s);
    if(pos==-1)
    System.out.println("Number not found.");
    else
      System.out.println("Number found at position:"+pos);
  } //end of main
}//end of class
