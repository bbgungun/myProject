import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.maven.core.domain.Teacherpageifo;
import com.ssm.maven.core.service.StudentpageifoService;
import com.ssm.maven.core.service.TeacherpageifoService;
import com.ssm.maven.core.service.imp.TeacherpageifoServiceImp;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class TeacherpageifoServiceImpTest {
	@Autowired
	private TeacherpageifoService tps;
	
	public void setSps(TeacherpageifoService tps) {
		this.tps = tps;
	}
//	@Test
//	public void test() {
//		Teacherpageifo tp=new Teacherpageifo();
//		tp.settName("Mr.zu");
//		tps.addTeaPageByBookId(1, tp);
//	}
	@Test
	public void test(){
		tps.findPageByBookId(1);
	}
}
