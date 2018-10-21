package google;

import java.util.LinkedList;
import java.util.Queue;

public class MyRequestCounter implements RequestCounter {
  private Queue<Integer> queue = new LinkedList<>();
  private long lastTs = 0;
  private static final long SEC = 10000000000L;

  public void increment() {

  }

  public long lastMinute() {

  }

  public long lastHour() {

  }

  public long lastDay() {

  }

}
