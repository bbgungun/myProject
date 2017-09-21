

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.maven.core.domain.AlumniBookifo;
import com.ssm.maven.core.service.AlumniBookService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class AlumniBookServiceImpTest {
	@Autowired
	private AlumniBookService abs;
	
	public void setAbs(AlumniBookService abs) {
		this.abs = abs;
	}

	@Test
	public void testadd() {
		Integer id=3;
		AlumniBookifo book=new AlumniBookifo();
		book.setAbName("我的同学录");
		book.setAbDescription("高三九班");
		abs.addBookByUserId(id, book,1);
	}
//	@Test
//	public void test1(){
//		Integer id=3;
//		List<AlumniBookifo> value=abs.findAllByUserId(id);
//		System.out.println(value);
//	}
//	@Test
//	public void test(){
//		Integer id=6;
//		AlumniBookifo value=abs.findByBookId(id);
//		System.out.println(value.toString());
//	}
//	@Test
//	public void test(){
//		AlumniBookifo book=new AlumniBookifo();
//		book.setAbDescription("ttetete");
//		book.setAbId(1);
//		abs.updateByBookId(book);
//	}
	@Test
	public void test(){
		abs.deleteByBookId(5);
	}
}
