	package UDF.UDFE1;

import java.io.IOException;

import org.apache.pig.EvalFunc;
import org.apache.pig.data.Tuple;

public class CapsToLo extends EvalFunc<String>{

	@Override
	public String exec(Tuple args) throws IOException {
		// TODO Auto-generated method stub
	
		String name = (String)args.get(0);
		
		return name.toLowerCase();
		
		//return null;
		
		
		
		
	}
}
