package fifth;

public class StopWatch_pra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StopWatch s = new StopWatch();
		int []n = new int[100000];
		for(int i = 0;i < 100000;i++) {
			n[i] = (int)(Math.random()*100);
		}
		selectionSort(n);
		s.stop(s.getElapsedTime());
		long executeTime = s.getEndTime()-s.getStartTime();
		System.out.println("执行时间为：" + executeTime + "Milliseconds.");
	}
	public static void selectionSort(int[] list) {
		for(int i = 0;i < list.length-1;i++) {
			int currentMax = list[i];
			int currentMaxIndex=i;
			
			for(int j = i + 1;j<list.length;j++) {
				if(currentMax < list[j]) {
					currentMax = list[j];
					currentMaxIndex = j;
				}
			}
			if(currentMaxIndex != i) {
				list[currentMaxIndex] = list[i];
				list[i] = currentMax;
			}
		}
		for(int i = 0;i < list.length;i++) {
			System.out.print(" " + list[i]);
		}
	}
}
