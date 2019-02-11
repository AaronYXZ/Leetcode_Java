package Math;

//https://leetcode.com/problems/rectangle-area/description/
public class L223_RectangleArea {

    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int left = Math.max(A, E);
        int right = Math.max(left, Math.min(C, G));
        int bottom = Math.max(B, F);
        int top = Math.max(bottom, Math.min(D, H));
        return (C -A) * (D - B) + (G - E) * (H - F) - (right - left)*(top - bottom);
    }
}
