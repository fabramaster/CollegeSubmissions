#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
int calculate_paint_cans(int n, int width, int length, int height, int A_P_C, int m) {
    long long wall_area_1 = (long long)width * height;
    long long wall_area_2 = (long long)length * height;
    long long roof_area = (long long)width * length;
    
    long long total_area - (2 * wall_area_1 + 2 * wall_area_2 + ceiling_area);
    
    //windows and doors
    for (int i = 0; i < m; i++) 
    {
        int opening_width, opening_height;
        scanf("%d %d", &opening_width, &opening_height);
        total_area -= (long long)opening_width * opening_height;
    }
    return (int)ceil((double)total_area / A_P_C)
}
int main() {
    int n, width, length, height, area, m;
    while(1) 
    {
        scanf("%d %d %d %d %d"), &n, &width, &length, &height, &area, &m);
    
        int result = calculate_paint_cans(n, width, length, height, area, m);
        prinft("%d\n", result);
    }
    return 0;
}
