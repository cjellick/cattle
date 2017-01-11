package io.cattle.platform.simple.allocator.dao;

import io.cattle.platform.allocator.service.AllocationCandidate;
import io.cattle.platform.core.model.Instance;
import io.cattle.platform.simple.allocator.ResourceRequest;

import java.util.Iterator;
import java.util.List;

public interface SimpleAllocatorDao {

    Iterator<AllocationCandidate> iteratorHosts(List<String> hostUUIDs, List<Long> volumeIds, QueryOptions options);
    
    ResourceRequest populateResourceRequestFromInstance(Instance instance, String resourceType, String poolType);
}
