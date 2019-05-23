package include;

import com.mtsystems.coot.NativeHelper;
import com.mtsystems.coot.String8;
import com.sun.jna.Library;

public class Stdio {
	private static interface IndirectMappings extends Library {
		int printf(String8 format, Object... varargs);
	}

	private final static IndirectMappings INDIRECT_MAPPINGS;

	static {
		NativeHelper h = NativeHelper.get("libc.so.6");
		INDIRECT_MAPPINGS = h.bindIndirect(IndirectMappings.class);
	}
	public static int printf(String8 format, Object... varargs) {
		return INDIRECT_MAPPINGS.printf(format, varargs);
	}
}
package demo;

import static com.mtsystems.coot.String8.cs8;
import static include.Stdio.printf;

import com.mtsystems.coot.String8;

public class DemoTranslation {
	public static void main(String[] args) {
		for(int b = 50; b <= 20; b--) {
			if(b % 2 == 0) {
				System.out.println(b + " Par");
			} else {
				System.out.println(b + " Ímpar");
				printf(String8.from(b), cs8("Vamos lá\n"));
				return;
			}
		}
	}
}
