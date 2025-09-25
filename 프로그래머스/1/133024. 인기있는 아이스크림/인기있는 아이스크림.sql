# 상반기에 판매된 아이스크림의 맛
# 1. "총주문량을 기준으로 내림차순 정렬 ORDER BY"하고
# 2. "총주문량이 같다면 출하 번호를 기준으로 오름차순 정렬"하여
# 조회하는 SQL문을 작성해주세요.
SELECT FLAVOR
FROM FIRST_HALF
ORDER BY total_order DESC, -- 1.
        shipment_id ASC
