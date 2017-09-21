import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.maven.core.service.ModelsService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class ModelsServiceImpTest {
	@Autowired
	private ModelsService ms;
	
	public void setMs(ModelsService ms) {
		this.ms = ms;
	}

	@Test
	public void test() {
		Integer Mid = ms.findMidByabId(7);
		System.out.println(Mid);
	}

}
