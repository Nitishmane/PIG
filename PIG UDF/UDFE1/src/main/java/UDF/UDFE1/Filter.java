package UDF.UDFE1;

import java.io.IOException;

import org.apache.pig.FilterFunc;
import org.apache.pig.data.Tuple;

public class Filter extends FilterFunc{

	@Override
	public Boolean exec(Tuple args) throws IOException {
		// TODO Auto-generated method stub
		//args.forEach(action);
		//args.
		String name = (String)args.get(0);
		if(name.contains("ll"))
		{
			return true;
			
		}
		else
			return false;
				
	}

}
