# !/bin/bash
# 注意，我们这里使用了 "echo 3"，但是不推荐使用在产品环境中，应该使用 "echo 1"
sync && echo 3 > /proc/sys/vm/drop_caches
