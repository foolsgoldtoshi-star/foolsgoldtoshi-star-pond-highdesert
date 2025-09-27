<!-- Sacred Teachings Page with Divine Grace -->
<script>
  import TeachingsIndex from '$lib/generated/TeachingsIndex.svelte';
</script>

<svelte:head>
  <title>Sacred Teachings | Guardian Dragon PBC</title>
  <meta name="description" content="Divine Grace wisdom for technological sovereignty and spiritual development" />
</svelte:head>

<main class="teachings-page">
  <TeachingsIndex />
</main>

<style>
  .teachings-page {
    min-height: 100vh;
    background: linear-gradient(135deg, #f8fffe 0%, #e6fffa 50%, #f0fdf4 100%);
    padding-top: 2rem;
  }

  /* Dark theme support */
  @media (prefers-color-scheme: dark) {
    .teachings-page {
      background: linear-gradient(135deg, #0a0e0d 0%, #1a2425 50%, #0d1f1c 100%);
    }
  }
</style>
