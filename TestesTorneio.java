import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import torneio.original.Torneio;

public class TorneioTeste {

	//N=0, K=1, HJ = 1
	@Test
	public void testC1(){
		List<Integer> hList = new ArrayList<Integer>();
		assertEquals(1, Torneio.torneio(0, 1, 1, hList));
	}
	
	//N=1, K=2, HJ = 0, H1 = 0
	@Test
	public void testC2(){
		List<Integer> hList = new ArrayList<Integer>();
		hList.add(0);
		assertEquals(2, Torneio.torneio(1, 2, 0, hList));
	}
	
	//N=1, K=2, HJ = 0, H1 = 1
	@Test
	public void testC3(){
		List<Integer> hList = new ArrayList<Integer>();
		hList.add(1);
		assertEquals(0, Torneio.torneio(1, 2, 0, hList));
	}
	
	//N=2, K=2, HJ = 3, H1 = 4, H2 = 2, H3 = 1
	@Test
	public void testC4(){
		List<Integer> hList = new ArrayList<Integer>();
		hList.add(4);
		hList.add(2);
		hList.add(1);
		assertEquals(8, Torneio.torneio(2, 2, 3, hList));
	}
	
	//N=3, K=2, HJ = 5, H1 = 2, H2 = 1, H3 = 4 H4 = 5, H5 =	8, H6 = 7, H7 =	3
	@Test
	public void testC5(){
		List<Integer> hList = new ArrayList<Integer>();
		hList.add(2);
		hList.add(1);
		hList.add(4);
		hList.add(5);
		hList.add(8);
		hList.add(7);
		hList.add(3);
		assertEquals(16128, Torneio.torneio(3, 2, 5, hList));
	}
	
	
	//N=2, K = 3, HJ = 2, H1 = 5, H2 = 4, H3 = 6
	@Test
	public void testC7(){
		List<Integer> hList = new ArrayList<Integer>();
		hList.add(5);
		hList.add(4);
		hList.add(6);
		assertEquals(0, Torneio.torneio(2, 3, 2, hList));
	}
	
	//N=3, K = 4, HJ = 5, H1 = 8, H2 = 7, H3 = 1, H4 = 0, H5 = 34, H6 = 6, H7 = 9
	@Test
	public void testC8(){
		List<Integer> hList = new ArrayList<Integer>();
		hList.add(8);
		hList.add(7);
		hList.add(1);
		hList.add(0);
		hList.add(34);
		hList.add(6);
		hList.add(9);
		assertEquals(0, Torneio.torneio(3, 4, 5, hList));
	}
	
	//N=4, K = 2, HJ = 5, H1 = 8, H2 = 4, H3 = 7, H4 = 1, H5 = 2, H6 = 3, H7 = 6, H8 = 9, H9 = 4, H10 = 5, H11 = 8, H12 = 7, H13 = 6, H14 = 2, H15 = 3

	@Test
	public void testC9(){
		List<Integer> hList = new ArrayList<Integer>();
		hList.add(8);
		hList.add(4);
		hList.add(7);
		hList.add(1);
		hList.add(2);
		hList.add(3);
		hList.add(6);
		hList.add(9);
		hList.add(4);
		hList.add(5);
		hList.add(8);
		hList.add(7);
		hList.add(6);
		hList.add(2);
		hList.add(3);
		assertEquals(705298877, Torneio.torneio(4, 2, 5, hList));
	}
	
	//N=3, K = 1, HJ = 5, H1 = 8, H2 = 4, H3 = 6, H4 = 9, H5 = 87, H6 = 5, H7 = 2
	@Test
	public void testC10(){
		List<Integer> hList = new ArrayList<Integer>();
		hList.add(8);
		hList.add(4);
		hList.add(6);
		hList.add(9);
		hList.add(87);
		hList.add(5);
		hList.add(2);
		assertEquals(34560, Torneio.torneio(3, 1, 5, hList));
	}
	
	//N=3, K = 1, HJ = 88, H1 = 5, H2 = 7, H3 = 4, H4 = 6, H5 = 2, H6 = 0, H7 = 3
	@Test
	public void testC11(){
		List<Integer> hList = new ArrayList<Integer>();
		hList.add(5);
		hList.add(7);
		hList.add(4);
		hList.add(6);
		hList.add(2);
		hList.add(0);
		hList.add(3);
		assertEquals(23040, Torneio.torneio(3, 1, 88, hList));
	}
	
	//N=4, K = 1, HJ = 55, H1 = 6, H2 = 8, H3 = 7, H4 = 4, H5 = 2, H6 = 1, H7 = 3, H8 = 6, H9 = 9, H10 = 5, H11 = 4, H12 = 8, H13 = 4, H14 = 5, H15 = 2 
	@Test
	public void testC12(){
		List<Integer> hList = new ArrayList<Integer>();
		hList.add(6);
		hList.add(8);
		hList.add(7);
		hList.add(4);
		hList.add(2);
		hList.add(1);
		hList.add(3);
		hList.add(6);
		hList.add(9);
		hList.add(5);
		hList.add(4);
		hList.add(8);
		hList.add(4);
		hList.add(5);
		hList.add(2);
		assertEquals(379143799, Torneio.torneio(4, 1, 55, hList));
	}
	
	//N=4, K = 1, HJ = 1, H1 = 6, H2 = 8, H3 = 7, H4 = 5, H5 = 2, H6 = 1, H7 = 9, H8 = 6, H9 = 9, H10 = 5, H11 = 4, H12 = 8, H13 = 4, H14 = 5, H15 = 2 
	@Test
	public void testC13(){
		List<Integer> hList = new ArrayList<Integer>();
		hList.add(6);
		hList.add(8);
		hList.add(7);
		hList.add(5);
		hList.add(2);
		hList.add(1);
		hList.add(9);
		hList.add(6);
		hList.add(9);
		hList.add(5);
		hList.add(4);
		hList.add(8);
		hList.add(4);
		hList.add(5);
		hList.add(2);
		assertEquals(789741546, Torneio.torneio(4, 1, 1, hList));
	}
	
	//N=4, K = 2, HJ = 96, H1 = 6, H2 = 8, H3 = 7, H4 = 4, H5 = 2, H6 = 6, H7 = 3, H8 = 6, H9 = 9, H10 = 7, H11 = 4, H12 = 8, H13 = 4, H14 = 5, H15 = 2 
	@Test
	public void testC14(){
		List<Integer> hList = new ArrayList<Integer>();
		hList.add(6);
		hList.add(8);
		hList.add(7);
		hList.add(4);
		hList.add(2);
		hList.add(6);
		hList.add(3);
		hList.add(6);
		hList.add(9);
		hList.add(7);
		hList.add(4);
		hList.add(8);
		hList.add(4);
		hList.add(5);
		hList.add(2);
		assertEquals(473984635, Torneio.torneio(4, 2, 96, hList));
	}
	
	
	
	/*//N=1, K=1, HJ = 1, H1 = 2, H2 = 1, H3 = 1
		@Test
		public void testC1(){
			List<Integer> hList = new ArrayList<Integer>();
			hList.add(2);
			hList.add(1);
			hList.add(1);
			assertEquals(2, Torneio.torneio(1, 1, 1, hList));
		}
		
		//N=1, K=1, HJ = 2, H1 = 1, H2 = 1, H3 = 1
		@Test
		public void testC2(){
			List<Integer> hList = new ArrayList<Integer>();
			hList.add(1);
			hList.add(1);
			hList.add(1);
			assertEquals(0, Torneio.torneio(1, 1, 2, hList));
		}
		
		//N=1, K=2, HJ = 4, H1 = 3, H3 = 1, H4 = 1
		@Test
		public void testC3(){
			List<Integer> hList = new ArrayList<Integer>();
			hList.add(3);
			hList.add(1);
			hList.add(1);
			assertEquals(2, Torneio.torneio(1, 2, 4, hList));
		}
		
		//N=2, K=1, HJ = 3, H1 = 4, H2 = 2, H3 = 1
		@Test
		public void testC4(){
			List<Integer> hList = new ArrayList<Integer>();
			hList.add(4);
			hList.add(2);
			hList.add(1);
			assertEquals(16, Torneio.torneio(2, 1, 3, hList));
		}
		
		//N=2, K=4, HJ = 1, H1 = 2, H2 = 4, H3 = 3
		@Test
		public void testC5(){
			List<Integer> hList = new ArrayList<Integer>();
			hList.add(2);
			hList.add(4);
			hList.add(3);
			assertEquals(0, Torneio.torneio(2, 4, 1, hList));
		}
		
		//N=2, K=1, HJ = 1, H1 = 2, H2 = 3, H3 = 4
		@Test
		public void testC6(){
			List<Integer> hList = new ArrayList<Integer>();
			hList.add(2);
			hList.add(3);
			hList.add(4);
			assertEquals(24, Torneio.torneio(2, 1, 1, hList));
		}
		
		//N=2, K = 10 (K > 4), HJ = 10( HJ > 4), H1 = 1, H2 = 2, H3 = 3
		@Test
		public void testC7(){
			List<Integer> hList = new ArrayList<Integer>();
			hList.add(1);
			hList.add(2);
			hList.add(3);
			assertEquals(24, Torneio.torneio(2, 10, 10, hList));
		}
		
		//N = 2, K = 2, HJ = 13 (HJ > 4), H1 = 10 (H1 > 4), H2 = 12 (H2 > 4), H3 = 14 (H3 > 4)
		@Test
		public void testC8(){
			List<Integer> hList = new ArrayList<Integer>();
			hList.add(10);
			hList.add(12);
			hList.add(14);
			assertEquals(16, Torneio.torneio(2, 2, 13, hList));
		}*/
		
	
}
