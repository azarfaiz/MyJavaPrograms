import java.util.*;

public class Cab {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ta = new int[100];
		char[] po = new char[100];
		int[] ti = new int[100];
		int[] fa = new int[100];
		int[][] de = new int[100][100];
		int tt,tp,index = -1,tf = 0;
		int c,time,cid = 0,bid = 0;
		char pp,dp;
		System.out.println("***********CAB MANAGEMENT***********");
		System.out.println("Enter the number of taxies available :");
		tt = sc.nextInt();
		System.out.println("Enter the number of Points available :");
		tp = sc.nextInt();
		for(int i = 0; i < tt; i++)
		{
			ta[i] = i+1;
			po[i] = 'A';
			ti[i] = -1;
			fa[i] = 0;
		}
		do{
			System.out.println("MENU\n1.Book a Taxi\n2.Display all\n3.Exit");
			c = sc.nextInt();
			switch(c)
			{
			case 1:
				{
					System.out.println("Enter customer ID: ");
					cid = sc.nextInt();
					System.out.println("Enter Pickup Point: ");
					pp = sc.next().charAt(0);
					System.out.println("Enter drop Point: ");
					dp = sc.next().charAt(0);
					//System.out.println(cid+"\t"+pp+"\t"+dp);
					if(pp < 'A' || pp >= (char)(65+tp) || dp < 'A' || dp >= (char)(65+tp))
					{
						System.out.println("Check your Pickup/Drop Points");
						break;
					}
					if(Math.abs(pp - dp) == 0)
					{
						System.out.println("Pickup and Drop points cannot be same");
						break;
					}
					System.out.println("Enter Pickup time: ");
					time = sc.nextInt();
					for(int i = 0; i < tt; i++)
					{
						if(index == -1 && po[i] == pp && ti[i] <= time)
						{
							index = i;
							tf = fa[i];
						}
						if(po[i] == pp && ti[i] <= time && fa[i] < tf)
						{
							index = i;
							tf = fa[i];
						}
					}
					System.out.println(index);
					if(index == -1)
					{
						index = find(pp,time,ta,po,ti,tt,fa);
					}
					if(index >= 0)
					{
						System.out.println("Taxi can be allotted!!!\nTaxi: "+ta[index]+" is alloted...");
						if(ti[index] == -1)
							ti[index] = time;
						po[index] = dp;
						ti[index] = ti[index]+Math.abs(pp-dp);
						fa[index] = fa[index]+(((Math.abs(pp-dp)*15)-5)*10)+100;
						System.out.println(po[index]+"\t"+ti[index]+"\t"+fa[index]);
						de[bid][0] = (bid+1);
						de[bid][1] = cid;
						de[bid][2] = (int)pp;
						de[bid][3] = (int)dp;
						de[bid][4] = time;
						de[bid][5] = ti[index];
						de[bid][6] = (((Math.abs(pp-dp)*15)-5)*10)+100;
						de[bid][7] = ta[index];
						bid++;
					}
					if(index == -1)
					{
						System.out.println("No Cab is available for the entered time!!!");
					}
					index = -1;
					break;
				}
			case 2:
				{
					for(int i = 0; i < tt; i++)
					{
						if(fa[i] != 0)
						{
							System.out.println("\nTaxi-"+ta[i]+"\tToal Earnings: Rs"+fa[i]);
							System.out.println("BID\tCID\tFr\tTo\tPT\tDT\tAmnt");
							for(int j = 0; j < bid; j++)
							{
								if(de[j][7] == ta[i])
								{
									System.out.println(de[j][0]+"\t"+de[j][1]+"\t"+(char)de[j][2]+"\t"+(char)de[j][3]+"\t"+de[j][4]+"\t"+de[j][5]+"\t"+de[j][6]);
								}
							}
						}
					}
					break;
				}
			}
		}while(c != 3);
		
		sc.close();
	}
	public static int find(char pp,int time,int[] ta, char[] po, int[] ti,int tt,int[] fa)
	{
		//pp,time,ta,po,ti,tt,fa
		int index = -1, temppos = 0, tf;
		int diff = Integer.MAX_VALUE;
		for(int i = 0; i < tt; i++)
		{
			if(ti[i] <= time && Math.abs(po[i] - pp) < diff)
			{
				diff =  Math.abs(po[i] - pp);
				index = i;
			}
		}
		if(index == -1)
			return index;
		else
		{
			temppos = po[index];
			tf = fa[index];
			for(int i = 0; i < tt; i++)
			{
				if(po[i] == temppos && ti[i] <= time && fa[i] < tf)
				{
					index = i;
					tf = fa[i];
				}
			}
			return index;
		}
	}
	
}
