package vagarant;

public class vagarant {
	public static void main(String[]args){
	    String prod[]={"leather wallet","umbrella","cigarette","honey"};
	    int[] price={1100,900,200,100};
	    int []gst={18,12,28,0};
	    int []quantity={1,4,3,2};
	    int max=0;
	    int index=0;
	    for(int i=0;i<4;i++)
	    {
	    	int gst1=(price[i]*quantity[i])/100*gst[i];
	        if(gst1>max)
	        {
	            max=gst1;
	             index=i;
	        }
	    }
	    System.out.println("the product with the highest gst value is "+ prod[index]);
	    for(int i=0;i<4;i++)
	    {
	        if(price[i]>=500)
	        {
	            price[i]=price[i]-(5/100*price[i]);
	        }
	    }
	    int sum=0;
	    for (int j=0;j<4;j++)
	    {
	        sum+=price[j]*quantity[j];
	    }
	     System.out.println("The total amount to be paid to the shopkeeper "+sum);
	}
}
