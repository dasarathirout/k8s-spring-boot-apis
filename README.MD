vault server --dev --dev-root-token-id="00000000-0000-0000-0000-000000000000"
set VAULT_TOKEN=00000000-0000-0000-0000-000000000000
set VAULT_ADDR=http://127.0.0.1:8200

vault kv put secret/api/zero api.zero.url=ZERO_URL api.zero.token=ZERO_API_TOKEN api.zero.username=spring api.zero.password=boot

