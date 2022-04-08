class KthLargest {
public:
    priority_queue<int>pq;
    int K=0;
    KthLargest(int k, vector<int>& nums) {
        K=k;
        for(int i:nums){
            pq.push(-i);
        }
    }
    
    int add(int val) {
        pq.push(-val);
        while(pq.size()!=K)pq.pop();
        return -pq.top();
    }
};

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest* obj = new KthLargest(k, nums);
 * int param_1 = obj->add(val);
 */