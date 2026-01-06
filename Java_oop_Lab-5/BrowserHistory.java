public class BrowserHistory {
    String[] history;
    int count;

    // Constructor
    public BrowserHistory(int size) {
        history = new String[size];
        count = 0;
    }

    // Show browser history
    public void showHistory() {
        if (count == 0) {
            System.out.println("No web pages visited yet.");
        } else {
            System.out.println("Browser History:");
            for (int i = 0; i < count; i++) {
                System.out.println(history[i]);
            }
        }
    }

    // Visit a new website
    public void visitWeb(String url) {
        if (count == history.length) {
            System.out.println("History is full. Cannot visit");
            System.out.println(url + " web page.");
        } else {
            history[count] = url;
            count++;
            System.out.println("Visited: " + url);
        }
    }

    // Show current website
    public void currentWeb() {
        if (count == 0) {
            System.out.println("You have not visited any website yet!");
        } else {
            System.out.println("Current web page: " + history[count - 1]);
        }
    }

    // Go back to previous page
    public void back() {
        if (count > 0) {
            count--;
        }
    }
}
