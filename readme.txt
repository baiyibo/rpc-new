docker run -d \
--name dubbo-admin \
-p 8082:8080 \
-e dubbo.registry.address=zookeeper://129.204.183.175:32771 \
-e dubbo.admin.root.password=root \
-e dubbo.admin.guest.password=guest \
chenchuxin/dubbo-admin



https://github.com/apache/dubbo-admin/blob/develop/docker/stack.yml#L20