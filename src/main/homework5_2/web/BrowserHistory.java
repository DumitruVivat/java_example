package main.homework5_2.web;

import java.util.*;

public class BrowserHistory {

    private Deque<String> history;

    public BrowserHistory() {
        history = new ArrayDeque<>();
    }

    public void visitSite(String site) {
        history.addLast(site);
    }

    public String back(int steps) {
        if(steps <= 0 || steps > history.size()) {
            return null;
        }

        Iterator<String> iterator = history.descendingIterator();
        String site = null;
        int currentStep = 0;

        while(iterator.hasNext() && currentStep < steps) {
            site = iterator.next();
            currentStep++;
        }
        return site;
    }

    public List<String> getHistory() {
        return new ArrayList<>(history);
    }
}
