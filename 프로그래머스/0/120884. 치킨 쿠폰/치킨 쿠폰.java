class Solution {
    public int solution(int chicken) {
        int serviceChicken = 0;
        int coupons = chicken;

        while (coupons >= 10) {
            int newService = coupons / 10;
            serviceChicken += newService;
            coupons = (coupons % 10) + newService;
        }

        return serviceChicken;
    }
}