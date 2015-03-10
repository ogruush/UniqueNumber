package test1;

import java.util.HashMap;
import java.util.Map.Entry;

public class FindUniq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(findUniNum(new int[]{1,2,1,3,2,1,4,5}));
//		System.out.println(findUniNum(new int[]{100,2,100,2,1,100}));
		int[] arr = new int[]{1,2,1,3,2,1,4,5};
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		
		System.out.println(findUniNum(map,arr));
		
	}
	
	/*public static int findUniNum(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			int count = 0;
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
				}
			}
			if(count == 1)
			{
				return arr[i];
			}
		}
		
		
		return 0;
	}*/
	
	public static int findUniNum(HashMap<Integer, Boolean> map, int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(map.containsKey(arr[i]))
				map.replace(arr[i], false, true);
			else
				map.put(arr[i], false);
		}
		
		for(Entry<Integer, Boolean> e: map.entrySet())
		{
			if(e.getValue() == false)
			{
				return e.getKey();
			}
		}
		return 0;
	}

}
