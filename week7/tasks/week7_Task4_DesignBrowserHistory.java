
import java.util.ArrayList;
import java.util.List;

class BrowserHistory {
    List<String> history = new ArrayList<>();
    int current = 0;

    public BrowserHistory(String homepage) {
        history.add(homepage);
    }

    public void visit(String url) {
        while (history.size() > current + 1) {
            history.remove(history.size() - 1);
        }

        history.add(url);
        current++;
    }

    public String back(int steps) {
        current = Math.max(0, current - steps);
        return history.get(current);
    }

    public String forward(int steps) {
        current = Math.min(history.size() - 1, current + steps);
        return history.get(current);
    }
}

public class week7_Task4_DesignBrowserHistory {
    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory("google.com");

        browser.visit("youtube.com");
        browser.visit("github.com");

        System.out.println(browser.back(1));
        System.out.println(browser.back(1));
        System.out.println(browser.forward(1));
    }
}
