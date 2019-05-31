package service;

import static org.junit.Assert.*;
import model.File;

import org.junit.Test;

public class FileServiceImplTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		File file= new File();
		 FileServiceImpl fileServiceImpl = new FileServiceImpl();
			Integer num=fileServiceImpl.insert(file);
		
		assertEquals(num, new Integer(5));
	}

}
