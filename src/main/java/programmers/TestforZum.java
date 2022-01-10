package programmers;

import java.util.*;
import java.util.stream.Collectors;

public class TestforZum {
    Map<Integer, Integer> resultMap = new HashMap<>();
    int[][] grid;

    public int[] solution(int[][] grid) {
        this.grid = grid;
        int[] answer = {};

        int length = grid.length;
        int width = grid[0].length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                Point point = new Point(i, j);
                List<Point> points = List.of(point);
                DownStandingRecursive(points, 1);
            }
        }

        List<Integer> collect = resultMap.keySet()
                .stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        answer[0] = collect.get(0);
        answer[1] = resultMap.get(answer[0]);
        return answer;
    }

    static class Point {
        int x;
        int y;

        private int getX() {
            return x;
        }

        private int getY() {
            return y;
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private boolean DownStandingRecursive(List<Point> points, int size) {
        List<Point> nextPoints = new ArrayList<>();
        boolean result = true;

        for (Point point : points) {
            if (point.getY() + 2 > grid[0].length || point.getX() + 1 > grid.length) {
                result = false;
                break;
            } else {
                int num = grid[point.getX()][point.getY()];

                Point newPoint1 = new Point(point.getX(), point.getY() + 1);
                Point newPoint2 = new Point(point.getX() + 1, point.getY() + 1);
                Point newPoint3 = new Point(point.getX() + 1, point.getY() + 2);
                nextPoints.add(newPoint1);
                nextPoints.add(newPoint2);
                nextPoints.add(newPoint3);

                if (num != grid[newPoint1.getX()][newPoint1.getY()] ||
                        num != grid[newPoint2.getX()][newPoint2.getY()] ||
                        num != grid[newPoint3.getX()][newPoint3.getY()]) {
                    result = false;
                    break;
                }
            }
        }

        if (result) {
            size += 1;
            if ( resultMap.containsKey(size) ) {
                resultMap.replace(size, resultMap.get(size));
            } else {
                resultMap.put(size, 1);
            }
            DownStandingRecursive(nextPoints, size);
        }
        return result;
    }
}
