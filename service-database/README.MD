SELECT * FROM user_details;
SELECT * FROM task_card_details;

SELECT action_cards->> 'name' as name FROM task_card_details;
SELECT action_cards->> 'tags' as TAGS FROM task_card_details;

--# ->> AS TEXT
--# -> AS JSONB

SELECT action_cards->> 'tags' CARD_TAGS,
action_cards->> 'name' CARD_NAME,
action_cards->> 'taskDetails' CARD_TASK
FROM task_card_details
WHERE action_cards-> 'status'='false';

SELECT action_cards->> 'tags' CARD_TAGS,
action_cards-> 'name' CARD_NAME,
action_cards-> 'taskDetails'-> 'actions' TASK_ACTION
FROM task_card_details
WHERE action_cards-> 'status'='false';
