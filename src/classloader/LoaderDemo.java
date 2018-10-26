package classloader;

import java.net.URL;

public class LoaderDemo {

	public static void main(String[] args) {
		URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
		for (int i = 0; i < urls.length; i++) {
		    System.out.println(urls[i].toExternalForm());
		}
	}

}
