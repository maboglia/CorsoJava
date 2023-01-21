package esempio;

public class PropertiesTest {
	
	public static void main(String[] args){
		String[] keys = {
			"java.version",
			"java.vendor",
			"java.vendor.url",
			"java.home",
			"java.vm.specification.version",
			"java.vm.specification.vendor",
			"java.vm.specification.name",
			"java.vm.version",
			"java.vm.vendor",
			"java.vm.name",
			"java.specification.version",
			"java.specification.vendor",
			"java.specification.name",
			"java.class.version",
			"java.class.path",
			"java.library.path",
			"java.io.tmpdir",
			"java.exist.dirs",
			"os.name",
			"os.arch",
			"os.version",
			"file.separator",
			"path.separator",
			"line.separator",
			"user.name",
			"user.home",
			"user.id"
		};
		
		for(int i=0; i<keys.length; i++){
			System.out.println(
				"[" + keys[i] + "] " + System.getProperty(keys[i]));
		}
	}
}