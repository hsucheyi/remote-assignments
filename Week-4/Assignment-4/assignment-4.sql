SELECT article.*, user.email
FROM article
JOIN user ON article.id = user.id;

SELECT *
FROM article
INNER JOIN user ON article.id = user.id
ORDER BY user.id
LIMIT 6, 6;