import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.maven.core.domain.Studentpageifo;
import com.ssm.maven.core.service.StudentpageifoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class StudentpageifoServiceImpTest {
	@Autowired
	private StudentpageifoService sps;
	
	public void setSps(StudentpageifoService sps) {
		this.sps = sps;
	}

	@Test
	public void test() {
		Studentpageifo sp=new Studentpageifo();
		sp.setpEmail("s");
		sps.addStuPageByBookId(1, sp);
	}
	
	@Test
	public void test1(){
		PageHelper.startPage(1, 1);
		List<Studentpageifo> list = sps.findAll();
		PageInfo page = new PageInfo(list, 1);
		List<Studentpageifo> list1 = page.getList();
		for (Studentpageifo studentpageifo : list1) {
			System.out.println(studentpageifo.getpId());
		}
	}
}
