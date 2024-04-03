package ThisKeyword;

public class ThisExample2 {

	
		int x=25,y=55;
		void calling(int x,double y) {
			System.out.println("local variable x: "+x);
			System.out.println("local variable y: "+y);
			System.out.println("non-static global y: "+y);
			

			System.out.println("non-static global x: "+this.x);
			System.out.println("non-static global y: "+this.y);
			//GNSV = LV;
		//	this.x=x;
		}
		public static void main(String[] args) {
			
			ThisExample1 t1=new ThisExample1();
			t1.calling(10,20.20);
		
			System.out.println("x: "+t1.x);//
			System.out.println("y: "+t1.y);//
		}
	}